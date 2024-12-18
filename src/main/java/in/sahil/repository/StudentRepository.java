package in.sahil.repository;

import org.springframework.data.repository.CrudRepository;

import in.sahil.entity.Student;

//@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
