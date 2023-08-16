package com.petitmonte.form;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class SampleForm extends ActionForm {
    private List<SampleForm2> sampleList;

    public List<SampleForm2> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<SampleForm2> sampleList) {
        this.sampleList = sampleList;
    }
}
