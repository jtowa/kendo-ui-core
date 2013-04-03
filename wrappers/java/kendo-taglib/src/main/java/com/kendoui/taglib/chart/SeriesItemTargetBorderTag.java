
package com.kendoui.taglib.chart;


import com.kendoui.taglib.BaseTag;






import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class SeriesItemTargetBorderTag extends  BaseTag  /* interfaces */ /* interfaces */ {
    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag


        SeriesItemTargetTag parent = (SeriesItemTargetTag)findParentWithClass(SeriesItemTargetTag.class);


        parent.setBorder(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    public static String tagName() {
        return "chart-seriesItem-target-border";
    }

    public void setColor(SeriesItemTargetBorderColorFunctionTag value) {
        setEvent("color", value.getBody());
    }

    public void setDashType(SeriesItemTargetBorderDashTypeFunctionTag value) {
        setEvent("dashType", value.getBody());
    }

    public void setWidth(SeriesItemTargetBorderWidthFunctionTag value) {
        setEvent("width", value.getBody());
    }

    public String getColor() {
        return (String)getProperty("color");
    }

    public void setColor(String value) {
        setProperty("color", value);
    }

    public String getDashType() {
        return (String)getProperty("dashType");
    }

    public void setDashType(String value) {
        setProperty("dashType", value);
    }

    public float getWidth() {
        return (float)getProperty("width");
    }

    public void setWidth(float value) {
        setProperty("width", value);
    }

//<< Attributes

}
