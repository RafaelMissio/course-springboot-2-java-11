package br.com.mtisi.course.contorller;


import br.com.mtisi.course.model.Order;
import br.com.mtisi.course.model.User;
import br.com.mtisi.course.services.OrderService;
import br.com.mtisi.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findall(){
        List<Order> orderList = orderService.findAll();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = orderService.finbById(id);
        return ResponseEntity.ok().body(order);
    }
}
