package com.codeforgeyt.jpapagingandsorting.repository;

import com.codeforgeyt.jpapagingandsorting.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
