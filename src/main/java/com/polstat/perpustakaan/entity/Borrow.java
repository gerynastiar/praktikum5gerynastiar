/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.perpustakaan.entity;

/**
 *
 * @author asus
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Borrows")

public class Borrow {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "memberId",referencedColumnName= "id", nullable = false)
    private Member member;
    
    @ManyToOne
    @JoinColumn(name = "bookId",referencedColumnName= "id", nullable = false)
    private Book book;
    
    @Column(nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate borrowedAt;
    
    @Column(nullable = true)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate returnedAt;
        
    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Column(nullable = true)
    private int hariTelat;
    
    public enum Status {
        Sedang_Dipinjam, Sudah_Dikembalikan
    }
}
