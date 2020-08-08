package ars.lk.dto;

public class UserDTO {
    private String nic;
    private String fullname;
    private String homeaddress;
    private String district;
    private String mobilenumber;
    private String email;
    private String profession;
    private String university;
    private String type;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String nic, String fullname, String homeaddress, String district, String mobilenumber, String email, String profession, String university, String type, String password) {
        this.nic = nic;
        this.fullname = fullname;
        this.homeaddress = homeaddress;
        this.district = district;
        this.mobilenumber = mobilenumber;
        this.email = email;
        this.profession = profession;
        this.university = university;
        this.type = type;
        this.password = password;
    }


    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "userDTO{" +
                "nic='" + nic + '\'' +
                ", fullname='" + fullname + '\'' +
                ", homeaddress='" + homeaddress + '\'' +
                ", district='" + district + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                ", university='" + university + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
