package com.qianshe.domain;

import java.sql.Timestamp;

/**
 * 由IDEA的DataSource反向生成
 */
public class Student {

  private long sno;
  private String sname;
  private java.sql.Timestamp sage;
  private String ssex;


  public Student() {
  }

  public Student(long sno, String sname, Timestamp sage, String ssex) {
    this.sno = sno;
    this.sname = sname;
    this.sage = sage;
    this.ssex = ssex;
  }

  public long getSno() {
    return sno;
  }

  public void setSno(long sno) {
    this.sno = sno;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public java.sql.Timestamp getSage() {
    return sage;
  }

  public void setSage(java.sql.Timestamp sage) {
    this.sage = sage;
  }


  public String getSsex() {
    return ssex;
  }

  public void setSsex(String ssex) {
    this.ssex = ssex;
  }

  @Override
  public String toString() {
    return "Student{" +
            "sno=" + sno +
            ", sname='" + sname + '\'' +
            ", sage=" + sage +
            ", ssex='" + ssex + '\'' +
            '}';
  }
}
