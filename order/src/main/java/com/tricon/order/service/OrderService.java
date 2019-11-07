package com.tricon.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tricon.order.dao.OrderDao;
import com.tricon.order.model.Customer;
import com.tricon.order.model.Order;
import com.tricon.order.model.OrderDetails;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private RestTemplate restTemplate;

	public void CreateOrder(Order order) {
		// TODO Auto-generated method stub

		orderDao.save(order);
	}

	public Optional<Order> getDetail(int id) {
		// TODO Auto-generated method stub
		Optional<Order> order = orderDao.findById(id);
		return order;
	}

	public OrderDetails getDetails(int id) {
		// TODO Auto-generated method stub
//    Customer cust = new  Customer();
		Order order=new Order();

//		String url = "http://localhost:8090/cust/2";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

//		Object obj = null;

		Customer customer = restTemplate.exchange("http://localhost:8090/cust/2",HttpMethod.GET,entity, Customer.class).getBody();
		System.out.println(customer);
		OrderDetails ord = new OrderDetails(customer, orderDao.findById(id));

		return ord;
	}

	public int orderCount() {
		// TODO Auto-generated method stub
		return orderDao.numberOfOrder();
	}

}
