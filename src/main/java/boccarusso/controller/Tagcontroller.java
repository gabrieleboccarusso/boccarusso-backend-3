package boccarusso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boccarusso.DTO.TagDTO;
import boccarusso.entity.Tag;
import boccarusso.service.TagService;

@RestController
@RequestMapping("/tag")
public class Tagcontroller {
 @Autowired
 private TagService tagService;

 @GetMapping
 Iterable<Tag> getAllTags() {
  return this.tagService.getAllTags();
 }

 @PostMapping
 ResponseEntity<Tag> postTag(@RequestBody TagDTO t) {
  return this.tagService.postTag(t);
 }
}