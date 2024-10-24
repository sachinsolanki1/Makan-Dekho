package com.univ.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private int salpur;
	private String cname,cadd,cemail,mob,unm,pw;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, int salpur, String cname, String cadd, String cemail, String mob, String unm, String pw) {
		super();
		this.cid = cid;
		this.salpur = salpur;
		this.cname = cname;
		this.cadd = cadd;
		this.cemail = cemail;
		this.mob = mob;
		this.unm = unm;
		this.pw = pw;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSalpur() {
		return salpur;
	}

	public void setSalpur(int salpur) {
		this.salpur = salpur;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", salpur=" + salpur + ", cname=" + cname + ", cadd=" + cadd + ", cemail="
				+ cemail + ", mob=" + mob + ", unm=" + unm + ", pw=" + pw + "]";
	}
	
	
	

}
