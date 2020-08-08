package ars.lk.entity;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    @Id
    private String email;
    private String nic;
    private String fullname;
    private String homeaddress;
    private String district;
    private String mobilenumber;

    private String profession;
    private String university;
    private String type;
    private String password;

    public User() {
    }

    public User(String email, String nic, String fullname, String homeaddress, String district, String mobilenumber, String profession, String university, String type, String password) {
        this.email = email;
        this.nic = nic;
        this.fullname = fullname;
        this.homeaddress = homeaddress;
        this.district = district;
        this.mobilenumber = mobilenumber;
        this.profession = profession;
        this.university = university;
        this.type = type;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "user{" +
                "email='" + email + '\'' +
                ", nic='" + nic + '\'' +
                ", fullname='" + fullname + '\'' +
                ", homeaddress='" + homeaddress + '\'' +
                ", district='" + district + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", profession='" + profession + '\'' +
                ", university='" + university + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

