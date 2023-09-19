/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.perpustakaan.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author asus
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long id;
    @NotEmpty(message = "Nama member wajib diisi.")
    private String name;
    @NotNull(message = "MemberID wajib diisi.")
    private String memberID;
    @NotNull(message = "Alamat wajib diisi.")
    private String address;   
    @NotNull(message = "Nomor Telpon wajib diisi.")
    private String phoneNumber;
}
