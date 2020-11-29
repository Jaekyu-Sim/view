package shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderlistRepository extends CrudRepository<Orderlist, Long> {


}