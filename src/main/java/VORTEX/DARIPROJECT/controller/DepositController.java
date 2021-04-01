package VORTEX.DARIPROJECT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import VORTEX.DARIPROJECT.ENTITY.Deposit_of_guarantees;
import VORTEX.DARIPROJECT.service.DepositService;


@RestController
@RequestMapping("deposit")
//@CrossOrigin("*")
public class DepositController {
	

	@Autowired
    private DepositService service;
	
	@PostMapping("/addeposit")
	public Deposit_of_guarantees addeposit(@RequestBody Deposit_of_guarantees deposit) {
		return service.save(deposit);
	}
	
	@GetMapping("/deposit/{id}")
	public Deposit_of_guarantees findById(@PathVariable int id) {
		return service.getdepositById(id);
	}
	
	@PutMapping("/update")
	public Deposit_of_guarantees updatedeposit(@RequestBody Deposit_of_guarantees deposit) {
		return service.updaterdeposit(deposit);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletedeposit(@PathVariable int id) {
		return service.deletedeposit(id);
	}
//	@GetMapping("/allstates")
//	public List <real_estate> retrieveAll() {
//		return service.retreiveallRealEstates();
//	}

}
