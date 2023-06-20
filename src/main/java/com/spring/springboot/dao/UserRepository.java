package com.spring.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.springboot.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> 
{
    public List<User> findByIdAndName(Integer id,String name); 
    public List<User> findByIdOrName(Integer id,String name);
    public List<User> findByNameStartingWith(String prefix);
    public List<User> findByNameContaining(String word);
    public List<User> findByNameEndingWith(String suffix);
    public List<User> findByNameLike(String pattern);
    public List<User> findByIdLessThan(Integer id);
    public List<User> findByIdGreaterThan(Integer id);
    public List<User> findByIdLessThanEqual(Integer id);
    public List<User> findByIdGreaterThanEqual(Integer id);
    public List<User> findByIdIn(List<Integer> ids);
    

    /*
     * Running Custom SQL queries:
     * 1. JPQL - @Param & @Query
     * 2. Native SQL 
     * 
     */

     @Query("select u from User u")
     public List<User> getAllUser();

     @Query("select u from User u where u.status=:n")
     public List<User> getByStatus(@Param("n") String status);

     @Query(value = "select * from user_details",nativeQuery = true)
     public List<User> getAllUsers();

     @Query(value = "select * from user_details u where u.student_status=:n",nativeQuery = true)
     public List<User> getByStatuss(@Param("n") String status); 

     
}
