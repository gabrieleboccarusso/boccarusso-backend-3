package boccarusso.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import boccarusso.entity.Project;
import boccarusso.repository.ProjectRepository;

@Component
public class ProjectDAO implements DAO<Project> {
 @Autowired
 ProjectRepository projectRepository;

 public Optional<Project> get(String id) {
  return this.projectRepository.findById(id);
 }

 public Project getExisting(String id) {
  return this.get(id).get();
 }

 public Iterable<Project> getAll() {
  return this.projectRepository.findAll();
 }

 public boolean delete(String id) {
  boolean flag = false;

  if (this.exists(id)) {
   this.projectRepository.deleteById(id);
   flag = true;
  }

  return flag;
 }

 public void deleteExisting(String id) {
  this.projectRepository.deleteById(id);
 }

 public Project save(Project p) {
  return this.projectRepository.save(p);
 }

 public boolean exists(String id) {
  boolean flag = false;

  if (this.projectRepository.existsById(id)) {
   flag = true;
  }

  return flag;
 }

}
