package th.mfu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;

@RestController
public class customerController {

    // Generate sample data
    public static Map<Integer,Customer> customers = new HashMap<>();
   private int nextId = 1;


   @PostMapping("/customer")
   public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
       customers.put(nextId++, customer);
       return new ResponseEntity<String>("Customer created successfully",HttpStatus.OK);
   }


    @GetMapping("/customer")
    public ResponseEntity<Collection<Customer>> getCustomer() {
        Collection<Customer> result = customers.values();
        return new ResponseEntity<Collection<Customer>>(result,HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Customer customer = customers.get(id);
        if (customer == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(customer,HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        if (!customers.containsKey(id)) {
            return new ResponseEntity<String>("Customer not found",HttpStatus.NOT_FOUND);
        }
        customers.remove(id);
        return new ResponseEntity<String>("Customer deleted successfully",HttpStatus.OK);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        if (!customers.containsKey(id)) {
            return new ResponseEntity<String>("Customer not found",HttpStatus.NOT_FOUND);
        }
        customers.put(id, customer);
        return new ResponseEntity<String>("Customer updated successfully",HttpStatus.OK);
    }
}
