package com.colvid.myapp;


public class HguColvidVO {
//  id : auto increment from database
//  residence_type : 0(기숙사), 1(외부거주)
//  confirmed_date : yyyy/mm/dd 형식
//  confirmed_status : 0(완치), 1(확진)
    private int id;
    private int residence_type;
    private String confirmed_date;
    private int confirmed_status;

//confirmedPatient table에서 확진자 - 완치자
    private int all_confirmed_count;
    private int all_recovered_count;

//  확진자 이동 경로 정보
//  route_date : yyyy/mm/dd
//  route_name : 확관 2층, 빨간 너구리
//  route_arrive_time : hh/mm
//  route_leave_time : hh/mm
    
    private String route_date;
    private String route_name;
    private String route_arrive_time;
    private String route_leave_time;

    
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }
    public int getResidence_type() {
        return residence_type;
    }

    public void setResidence_type(int residence_type) {
        this.residence_type = residence_type;
    }
    public String getConfirmed_date() {
        return confirmed_date;
    }

    public void setConfirmed_date(String confirmed_date) {
        this.confirmed_date = confirmed_date;
    }

    public int getConfirmed_status() {
        return confirmed_status;
    }

    public void setConfirmed_status(int confirmed_status) {
        this.confirmed_status = confirmed_status;
    }
  

    public int getAll_confirmed_count() {
	return all_confirmed_count;
    }

    public void setAll_confirmed_count(int all_confirmed_count) {
	this.all_confirmed_count = all_confirmed_count;
    }

    public int getAll_recovered_count() {
	return all_recovered_count;
    }

    public void setAll_recovered_count(int all_recovered_count) {
	this.all_recovered_count = all_recovered_count;
    }

    public String getRoute_date() {
	return route_date;
    }

    public void setRoute_date(String route_date) {
	this.route_date = route_date;
    }
    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }
    public String getRoute_arrive_time() {
        return route_arrive_time;
    }

    public void setRoute_arrive_time(String route_arrive_time) {
        this.route_arrive_time = route_arrive_time;
    }

    public String getRoute_leave_time() {
        return route_leave_time;
    }

    public void setRoute_leave_time(String route_leave_time) {
        this.route_leave_time = route_leave_time;
    }

   


  

    

}
