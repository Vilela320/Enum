package apliccation;

import java.util.Date;

import entitie.Order;
import entities.enun.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
	}

}
