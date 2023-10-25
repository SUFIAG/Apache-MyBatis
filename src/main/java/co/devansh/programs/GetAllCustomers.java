/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-06-2022/06/2022
 *   Time: 01:32 PM
 *   File: GetAllCustomers
 */

package co.devansh.programs;

import co.devansh.dao.CustomerDao;
import co.devansh.dao.DaoFactory;
import co.devansh.entity.Customer;

import java.io.IOException;
import java.util.List;

public class GetAllCustomers {
    public static void main(String[] args) throws IOException {
        CustomerDao dao = DaoFactory.getCustomerDao();
        List<Customer> list = dao.getAllCustomers();

        System.out.println("There are " + list.size() + " customers.");

        for (Customer customer : list) {
            System.out.println(customer.getName() + " is from " + customer.getCity());
        }
    }
}
