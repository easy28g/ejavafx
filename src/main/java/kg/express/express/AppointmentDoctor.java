package kg.express.express;

public class AppointmentDoctor {
    private int code;
    private String fio;
    private String date;
    private String time;
    private String patient;
    private String gender;
    private String birthday;

    public AppointmentDoctor(int code, String fio, String date, String time, String patient, String gender, String birthday) {
        this.code = code;
        this.fio = fio;
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
