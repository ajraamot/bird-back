package com.example.BirdApp.controller;

import com.example.BirdApp.model.Bird;
import com.example.BirdApp.repository.IBirdRepository;
import com.example.BirdApp.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin // what does this mean? do i need this?
@RequestMapping("birds/") // http://localhost:9001/api/birds/
public class BirdController {

    // in pluralsight course, he had
//    @Autowired
//    private IBirdRepository repository;
// however, in my app, the BirdService implements the IBirdRepository

    private BirdService service;

//    @Autowired // this was in pluralsight course
//    public BirdController(final BirdService birdService) {
//        this.birdService = birdService;
//    }

    @Autowired
    public void setService(BirdService service) {
        this.service = service;
    }

    @RequestMapping(value="all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Bird> index() {
        return this.service.findAll();
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.POST)
    public Bird create(@RequestBody Bird bird) {
        return this.service.save(bird);
    }

//    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
//    public Page<Bird> index(@RequestParam(name="page", required = false, defaultValue = "0") int page) {
//        return this.service.findAll(page);
//    }


//    @RequestMapping(value="test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String helloWorld() {
//        // http://localhost:9001/api/birds/
//        return ({message: "Hello World"});
//    }

//    // code from tasker /////////
//    private IBirdRepository repository;
//
//    @Autowired
//    public void setRepository(IBirdRepository repository) { this.repository = repository; }
//
//    @RequestMapping(path = {"add", "add/"}, method = RequestMethod.POST)
//    public Bird create(@RequestBody Bird bird) { return repository.save(bird); }


//    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
//    public Page<Bird> index(@RequestParam(name = "page", required = false, defaultValue = "0") int page) {
//        return this.birdService.findAll();
//    }


//    @RequestMapping(value="{id}", method = RequestMethod.POST)
//    public Bird create(@RequestBody Bird bird) {
//        return this.birdService.create(bird);
//    }

//    @RequestMapping(value="{id}", method = RequestMethod.GET)
//    public Bird get(@PathVariable int id) {
//        return this.birdService.get(id);
//    }
//
//    @RequestMapping(value="{id}", method = RequestMethod.PUT)
//    public Bird update(@PathVariable int id, @RequestBody Bird bird) {
//        return this.birdService.update(id, bird);
//    }
//
//    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
//    public Bird delete(@PathVariable int id) {
//        return this.birdService.delete(id);
//    }





//    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
//    public ResponseEntity<?> createBird(@Valid @RequestBody AuthDto auth) throws JsonProcessingException {
//        Bird bird = new Bird();
//        Bird savedBird = birdService.save(bird);
//        return ResponseEntity.status(HttpStatus.CREATED).body(null);
//    }
}
