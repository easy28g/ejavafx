package kg.express.express;

public class FindAnalyse {
    private int code;
    private String fio;
    private String birthday;
    private String gender;
    private String registrator;
    private String dateRegistration;
    private String statusDocument;
    private String comment;
    private String analyse;
    private String appointmentDoctor;
    private String dateResult;

    public FindAnalyse(int code, String fio, String birthday, String gender,
                       String registrator, String dateRegistration, String statusDocument,
                       String comment, String analyse, String appointmentDoctor, String dateResult) {
        this.code = code;
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.registrator = registrator;
        this.dateRegistration = dateRegistration;
        this.statusDocument = statusDocument;
        this.comment = comment;
        this.analyse = analyse;
        this.appointmentDoctor = appointmentDoctor;
        this.dateResult = dateResult;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegistrator() {
        return registrator;
    }

    public void setRegistrator(String registrator) {
        this.registrator = registrator;
    }

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public String getStatusDocument() {
        return statusDocument;
    }

    public void setStatusDocument(String statusDocument) {
        this.statusDocument = statusDocument;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse;
    }

    public String getAppointmentDoctor() {
        return appointmentDoctor;
    }

    public void setAppointmentDoctor(String appointmentDoctor) {
        this.appointmentDoctor = appointmentDoctor;
    }

    public String getDateResult() {
        return dateResult;
    }

    public void setDateResult(String dateResult) {
        this.dateResult = dateResult;
    }
}
