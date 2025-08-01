package com.example.postfolio.profile.entity;

import com.example.postfolio.user.entity.User;
import com.example.postfolio.profile.model.OccupationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profile_picture", length = 10485760) // ~10MB
    private String pictureBase64;


    private String bio;

    private LocalDate birthDate;

    private String sscResult;
    private String hscResult;
    private String universityResult;
    private String positionOrInstitue;
    private String phoneNumber;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    @JsonIgnore
    private User user;
}
