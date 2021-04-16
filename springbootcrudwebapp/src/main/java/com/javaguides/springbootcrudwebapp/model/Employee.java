package com.javaguides.springbootcrudwebapp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastname;
	
	@Column(name = "employment_ID")
	private String employmentid;
	
	@Column(name = "Start_Date")
	private Date startdate;
	
	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "Department")
	private String department;
	
	@Column(name = "End_Date")
	private Date enddate;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "Date_of_Birth")
	private Date dob;
	
	@Column(name = "Reporting_Manager")
	private String reportingmanager;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Blood_Group")
	private String bloodgroup;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name="dependent_fisrt_name")
	private String dependentfirstname;
	
	@Column(name="dependent_last_name")
	private String dependentlastname;
	
	@Column(name="dependent_gender")
	private String dependentgender;
	
	@Column(name="DependentDOB")
	private Date dependentdob;
	
	@Column(name="Dependent_relationship")
	private String dependentrelationship;
	
	@Column(name="Education_type")
	private String educationtype;
	
	@Column(name="education_start_date")
	private Date educationstartdate;
	
	@Column(name="education_end_date")
	private Date educationenddate;
	
	@Column(name="institute_name")
	private String institutename;
	
	@Column(name="Institute_address")
	private String instituteaddress;
	
	@Column(name="percentage")
	private long percentage;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmploymentid() {
		return employmentid;
	}

	public void setEmploymentid(String employmentid) {
		this.employmentid = employmentid;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getReportingmanager() {
		return reportingmanager;
	}

	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDependentfirstname() {
		return dependentfirstname;
	}

	public void setDependentfirstname(String dependentfirstname) {
		this.dependentfirstname = dependentfirstname;
	}

	public String getDependentlastname() {
		return dependentlastname;
	}

	public void setDependentlastname(String dependentlastname) {
		this.dependentlastname = dependentlastname;
	}

	public String getDependentgender() {
		return dependentgender;
	}

	public void setDependentgender(String dependentgender) {
		this.dependentgender = dependentgender;
	}

	public Date getDependentdob() {
		return dependentdob;
	}

	public void setDependentdob(Date dependentdob) {
		this.dependentdob = dependentdob;
	}

	public String getDependentrelationship() {
		return dependentrelationship;
	}

	public void setDependentrelationship(String dependentrelationship) {
		this.dependentrelationship = dependentrelationship;
	}

	public String getEducationtype() {
		return educationtype;
	}

	public void setEducationtype(String educationtype) {
		this.educationtype = educationtype;
	}

	public Date getEducationstartdate() {
		return educationstartdate;
	}

	public void setEducationstartdate(Date educationstartdate) {
		this.educationstartdate = educationstartdate;
	}

	public Date getEducationenddate() {
		return educationenddate;
	}

	public void setEducationenddate(Date educationenddate) {
		this.educationenddate = educationenddate;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getInstituteaddress() {
		return instituteaddress;
	}

	public void setInstituteaddress(String instituteaddress) {
		this.instituteaddress = instituteaddress;
	}

	public long getPercentage() {
		return percentage;
	}

	public void setPercentage(long percentage) {
		if(percentage>100)
			System.out.print("Please Enter below 100 percent");
		else		
		this.percentage = percentage;
	}
	
}
	