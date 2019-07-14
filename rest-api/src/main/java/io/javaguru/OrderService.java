package io.javaguru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private List<Order> orders = new ArrayList<>(Arrays.asList(
			new Order(1,"ORDER-1", "DESC-1"),
			new Order(2, "ORDER-2","DEsC-2")));

	
	public List<Order> getAllOrders(){
		return orders;
	}

	public Order getOrder(Integer id) {
		return orders.stream().filter(o -> o.getId().equals(id)).findFirst().get();
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void updateOrder(Integer id, Order order) {
		for (int i=0; i < orders.size(); i++) {
			Order t = orders.get(i);
			if (t.getId().equals(id)) {
				orders.set(i,order);
				return;
			}
		}
	}
	
	public void deleteOrder(Integer id) {
		orders.removeIf(o -> o.getId().equals(id));
	}

}
