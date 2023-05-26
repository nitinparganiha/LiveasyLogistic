package Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Entity.Loads;
import implementjparepository.implementJpa;

@RestController
public class Controllers {
	@Autowired
implementJpa i;
	
	@PostMapping("/postload")
	public String payload(@RequestBody Loads l) {
		i.save(l);
		return "loads details added successfully";
	}
	
	@GetMapping("/gettloadbByid")
	public Loads  GetLoads(@RequestParam String id) {
		Optional<Loads>o=i.findById(id);
		Loads l=o.get();
		return l;
	}
	
	@PutMapping("/Putload")
	public String Putload(@RequestBody Loads l) {
		i.save(l);
		return "loads details Update successfully";
	}
	
	@DeleteMapping("/DeleteByid")
	public String DeleteByid(@RequestParam String id) {
		i.deleteById(id);
		return "Delete Successfull";
	}
}
