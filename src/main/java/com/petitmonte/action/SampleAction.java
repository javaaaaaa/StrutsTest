package com.petitmonte.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.petitmonte.form.SampleForm;
import com.petitmonte.form.SampleForm2;

public class SampleAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SampleForm sampleForm = (SampleForm) form;

        List<SampleForm2> sampleList = new ArrayList<>();
        
        SampleForm2 sample2 = new SampleForm2();
        sample2.setName("tanaka");
        sample2.setAge("20");
        sampleList.add(sample2);
        SampleForm2 sample3 = new SampleForm2();
        sample3.setName("iwai");
        sample3.setAge("24");
        sampleList.add(sample3);
        SampleForm2 sample4 = new SampleForm2();
        sample4.setName("aiueo");
        sample4.setAge("30");
        sampleList.add(sample4);
        
        sampleForm.setSampleList(sampleList);

        return mapping.findForward("success");
    }
}

