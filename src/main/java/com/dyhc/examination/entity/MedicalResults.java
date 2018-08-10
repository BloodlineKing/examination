package com.dyhc.examination.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "medical_results", schema = "hospital_test_manager_db", catalog = "")
public class MedicalResults {
    private int medicalResultsId;
    private String testNumber;
    private String medicalId;
    private int roleInfoId;
    private Timestamp checkDate;
    private int commonResultsId;
    private int proposedDescriptionId;

    @Id
    @Column(name = "medical_results_id")
    public int getMedicalResultsId() {
        return medicalResultsId;
    }

    public void setMedicalResultsId(int medicalResultsId) {
        this.medicalResultsId = medicalResultsId;
    }

    @Basic
    @Column(name = "test_number")
    public String getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }

    @Basic
    @Column(name = "medical_id")
    public String getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(String medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "role_info_id")
    public int getRoleInfoId() {
        return roleInfoId;
    }

    public void setRoleInfoId(int roleInfoId) {
        this.roleInfoId = roleInfoId;
    }

    @Basic
    @Column(name = "checkDate")
    public Timestamp getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Timestamp checkDate) {
        this.checkDate = checkDate;
    }

    @Basic
    @Column(name = "common_results_id")
    public int getCommonResultsId() {
        return commonResultsId;
    }

    public void setCommonResultsId(int commonResultsId) {
        this.commonResultsId = commonResultsId;
    }

    @Basic
    @Column(name = "proposed_description_id")
    public int getProposedDescriptionId() {
        return proposedDescriptionId;
    }

    public void setProposedDescriptionId(int proposedDescriptionId) {
        this.proposedDescriptionId = proposedDescriptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalResults that = (MedicalResults) o;
        return medicalResultsId == that.medicalResultsId &&
                roleInfoId == that.roleInfoId &&
                commonResultsId == that.commonResultsId &&
                proposedDescriptionId == that.proposedDescriptionId &&
                Objects.equals(testNumber, that.testNumber) &&
                Objects.equals(medicalId, that.medicalId) &&
                Objects.equals(checkDate, that.checkDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalResultsId, testNumber, medicalId, roleInfoId, checkDate, commonResultsId, proposedDescriptionId);
    }
}
