package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department department = new Department(42, "Books");
		Seller seller = new Seller(01, "Daniel", "@gmail", new Date(), 3000.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		System.out.println(department);
		
	}

}
