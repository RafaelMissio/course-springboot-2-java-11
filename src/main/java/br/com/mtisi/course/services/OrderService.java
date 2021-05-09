package br.com.mtisi.course.services;

import br.com.mtisi.course.model.Order;
import br.com.mtisi.course.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository userRepository;

    public List<Order> findAll(){
        return userRepository.findAll();
    }


    public Order finbById(Long id){
        Optional<Order> obj = userRepository.findById(id);
        return obj.get();
    }
}
