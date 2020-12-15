package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Departament obj = new Departament(42, "Daniel");
		Seller seller = new Seller(01, "Daniel", "@gmail", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
		System.out.println(obj);
	}

}
