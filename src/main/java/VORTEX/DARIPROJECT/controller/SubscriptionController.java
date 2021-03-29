package VORTEX.DARIPROJECT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import VORTEX.DARIPROJECT.ENTITY.EntityPrice;
import VORTEX.DARIPROJECT.ENTITY.subscription;
import VORTEX.DARIPROJECT.service.SubscriptionService;
@RequestMapping("api")
@RestController
@CrossOrigin("*")
public class SubscriptionController {
	
	@Autowired
	private SubscriptionService service;
	
	@PostMapping("/addSubscription")
	public List<subscription> addSubscription(@RequestBody List<subscription> Subscriptions) {
		return service.saveSubscriptions(Subscriptions);
	}
	
	@GetMapping("/Subscription/{id}")
	public subscription findSubscriptionById(@PathVariable int id) {
		return service.getSubscriptionsById(id);
	}
	
	@PutMapping("/update")
	public subscription updateSubscription(@RequestBody subscription subscription) {
		return service.updateSubscription(subscription);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSubscription(@PathVariable int id) {
		return service.deleteSubscription(id);
	}
	
	@GetMapping("/subpric")
	
	private List<subscription> getSubpr(){
		return  service.getSubprice();
	}

}
