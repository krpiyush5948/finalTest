package com.tricon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tricon.order.model.Order;
import com.tricon.order.model.OrderDetails;
import com.tricon.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	/**
	 * creating RestTemplate instance
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * this function fetch order details.
	 * 
	 * @param order
	 */
//	@GetMapping("orderDetails/{id}")
//	public Optional<Order> getDetail(@PathVariable int id) {
//		
//		String url = "http://localhost:8090/cust/2";
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		HttpEntity<String>entity=new HttpEntity<String>(headers);
//		
//		Object obj = null;
//		
//		Customer customer = restTemplate.exchange(url, HttpMethod.GET, entity, Customer.class).getBody();
//		System.out.println(customer);
//		return orderService.getDetail(id);
//	}

	@GetMapping("order/{id}")
	public OrderDetails getDetails(@PathVariable int id) {
		return orderService.getDetails(id);
	}
	
	@PostMapping("create")
	public void CreateOrder(@RequestBody Order order) {
		orderService.CreateOrder(order);
	}
	
	@GetMapping("/")
	public int orderCount() {
	    return orderService.orderCount();
		
	}
}
