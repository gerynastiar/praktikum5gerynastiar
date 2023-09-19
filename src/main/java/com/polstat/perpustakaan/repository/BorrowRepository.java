/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.polstat.perpustakaan.repository;

/**
 *
 * @author asus
 */
import com.polstat.perpustakaan.entity.Borrow;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "borrow", path = "borrow")

public interface BorrowRepository extends PagingAndSortingRepository<Borrow, Long>, CrudRepository<Borrow, Long> {
    List<Borrow> findByMember_Id(@Param("idMember") Long memberId);
    List<Borrow> findByBook_Id(@Param("idBook") Long bookId);
    List<Borrow> findByMember_IdAndBook_Id(@Param("idMember") Long memberId, @Param("idBook") Long bookId);
}
