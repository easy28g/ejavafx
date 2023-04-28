package kg.express.express;

public class RegPatient {
    private int codeReg;
    private String fioReg;
    private String purposeReg;
    private String dateReg;
    private String resultReg;
    private String gender;
    private String sumReg;
    private String commentReg;

    public RegPatient() {
    }

    public RegPatient(int codeReg, String fioReg, String purposeReg,
                      String dateReg, String resultReg, String gender,
                      String sumReg, String commentReg) {
        this.codeReg = codeReg;
        this.fioReg = fioReg;
        this.purposeReg = purposeReg;
        this.dateReg = dateReg;
        this.resultReg = resultReg;
        this.gender = gender;
        this.sumReg = sumReg;
        this.commentReg = commentReg;
    }

    public int getCodeReg() {
        return codeReg;
    }

    public void setCodeReg(int codeReg) {
        this.codeReg = codeReg;
    }

    public String getFioReg() {
        return fioReg;
    }

    public void setFioReg(String fioReg) {
        this.fioReg = fioReg;
    }

    public String getPurposeReg() {
        return purposeReg;
    }

    public void setPurposeReg(String purposeReg) {
        this.purposeReg = purposeReg;
    }

    public String getDateReg() {
        return dateReg;
    }

    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    public String getResultReg() {
        return resultReg;
    }

    public void setResultReg(String resultReg) {
        this.resultReg = resultReg;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSumReg() {
        return sumReg;
    }

    public void setSumReg(String sumReg) {
        this.sumReg = sumReg;
    }

    public String getCommentReg() {
        return commentReg;
    }

    public void setCommentReg(String commentReg) {
        this.commentReg = commentReg;
    }
}

