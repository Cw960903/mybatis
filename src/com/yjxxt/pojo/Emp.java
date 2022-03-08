package com.yjxxt.pojo;

import java.util.Date;

public class Emp {
    private int empno;
    private String ename;
    private double sal;
    private String job;
    private double comm;
    private int mgr;
    private Date hiredate;
    private int deptno;

    public Emp() {
    }

    public Emp(int empno, String ename, double sal, String job, double comm, int mgr, Date hiredate, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.job = job;
        this.comm = comm;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", sal=" + sal +
                ", job='" + job + '\'' +
                ", comm=" + comm +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                '}';
    }
}
