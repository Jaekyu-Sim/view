package shop;

import shop.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderlistViewHandler {


    @Autowired
    private OrderlistRepository orderlistRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrdered(@Payload Ordered ordered)
    {
        try
        {
            if(ordered.isMe())
            {
                System.out.println("jkjkjk");
                Orderlist orderList = new Orderlist();
                //view 객체 이벤트 value set
                orderList.setId(ordered.getId());
                orderList.setQty(ordered.getQty());
                orderList.setProductId((ordered.getProductId()));
                orderList.setOrderStatus(ordered.getStatus());

                orderlistRepository.save(orderList);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }



}