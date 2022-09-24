package com.devices.store.common.entity;


import org.hibernate.annotations.DynamicUpdate;

import com.devices.store.common.consts.enums.GenderEnum;
import com.devices.store.common.consts.enums.RegistrationMethodEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Entity
@DynamicUpdate
@Table(name = "users")
public class User implements Serializable {

    @Id
    @SequenceGenerator(name = "USER_SEC", initialValue = 1, allocationSize = 1, sequenceName = "USER_SEC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEC")
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String name;

    @Column(name = "username", nullable = true, unique = true)
    private String userName;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "country_code", nullable = true)
    private String countryCode;

    @Column(name = "is_anonymous", nullable = true)
    private boolean anonymous;

    @Column(name = "is_active", nullable = true)
    private boolean active;

    @Column(name = "is_verified", nullable = true)
    private boolean verified;

    @Column(name = "rate", nullable = true)
    private int rate;

    @Column(name = "gender", nullable = true)
    private GenderEnum gender;

    @Column(name = "birthdate", nullable = true)
    private Date birthDate;

    @Column(name = "qr_code", nullable = true)
    private String qrCode;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "password", nullable = true)
    private String password;

    private String photo;

    private Double balance;

    private Double transferableBalance;

    private String faculty;

    private String university;

    @Column(name = "enrollment_year")
    private Integer enrollmentYear;

    @Column(name = "graduation_year")
    private Integer graduationYear;

    @Column(name = "registration_method")
    private RegistrationMethodEnum registrationMethod;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private ArrayList<Device> deviceId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTransferableBalance() {
        return transferableBalance;
    }

    public void setTransferableBalance(Double transferableBalance) {
        this.transferableBalance = transferableBalance;
    }

    public RegistrationMethodEnum getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(RegistrationMethodEnum registrationMethod) {
        this.registrationMethod = registrationMethod;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Integer enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ArrayList<Device> getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(ArrayList<Device> deviceId) {
		this.deviceId = deviceId;
	}
    
    


}
