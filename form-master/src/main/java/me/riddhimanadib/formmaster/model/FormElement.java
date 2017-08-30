package me.riddhimanadib.formmaster.model;

import java.util.ArrayList;
import java.util.List;
import me.riddhimanadib.formmaster.listener.OnFormElementValueChangedListener;

/**
 * Created by Adib on 16-Apr-17.
 */

public class FormElement implements FormObject {

    // different types for the form elements
    public static final int TYPE_EDITTEXT_TEXT_SINGLELINE = 1;
    public static final int TYPE_EDITTEXT_TEXT_MULTILINE = 2;
    public static final int TYPE_EDITTEXT_NUMBER = 3;
    public static final int TYPE_EDITTEXT_EMAIL = 4;
    public static final int TYPE_EDITTEXT_PHONE = 5;
    public static final int TYPE_PICKER_DATE = 6;
    public static final int TYPE_PICKER_TIME = 7;
    public static final int TYPE_SPINNER_DROPDOWN = 8;
    public static final int TYPE_PICKER_MULTI_CHECKBOX = 9;
    public static final int TYPE_EDITTEXT_PASSWORD = 10;

    // private variables
    private int mTag; // unique tag to identify the object
    private int mType; // type for the form element
    private String mTitle; // title to be shown on left
    private String mValue; // value to be shown on right
    private List<String> mOptions; // list of options for single and multi picker
    private List<String> mOptionsSelected; // list of selected options for single and multi picker
    private String mHint; // value to be shown if mValue is null
    private boolean mRequired; // value to set is the field is required

    private String alertTitle; // title to be shown on alertdialog for TYPE_SPINNER_DROPDOWN and TYPE_PICKER_MULTI_CHECKBOX
    private String positiveButtonText; // String to be shown on positive button alertdialog for TYPE_PICKER_MULTI_CHECKBOX
    private String negativeButtonText; // String to be shown on negative button alertdialog for TYPE_PICKER_MULTI_CHECKBOX

    public FormElement() {
    }

    /**
     * static method to create instance
     *
     * @return
     */
    public static FormElement createInstance() {
        return new FormElement();
    }

    // getters and setters
    public FormElement setTag(int mTag) {
        this.mTag = mTag;
        return this;
    }

    public FormElement setType(int mType) {
        this.mType = mType;
        return this;
    }

    public FormElement setTitle(String mTitle) {
        this.mTitle = mTitle;
        return this;
    }

    public FormElement setValue(String mValue) {
        this.mValue = mValue;
        return this;
    }

    public FormElement setHint(String mHint) {
        this.mHint = mHint;
        return this;
    }

    public FormElement setRequired(boolean required) {
        this.mRequired = required;
        return this;
    }

    public FormElement setOptions(List<String> mOptions) {
        this.mOptions = mOptions;
        return this;
    }

    public FormElement setOptionsSelected(List<String> mOptionsSelected) {
        this.mOptionsSelected = mOptionsSelected;
        return this;
    }

    public int getTag() {
        return this.mTag;
    }

    public int getType() {
        return this.mType;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getValue() {
        return (this.mValue == null) ? "" : this.mValue;
    }

    public String getHint() {
        return (this.mHint == null) ? "" : this.mHint;
    }

    public boolean isRequired() {
        return this.mRequired;
    }

    public List<String> getOptions() {
        return (this.mOptions == null) ? new ArrayList<String>() : this.mOptions;
    }

    public List<String> getOptionsSelected() {
        return (this.mOptionsSelected == null) ? new ArrayList<String>() : this.mOptionsSelected;
    }

    @Override
    public boolean isHeader() {
        return false;
    }

    @Override
    public String toString() {
        return "TAG: " + String.valueOf(this.mTag) + ", TITLE: " + this.mTitle + ", VALUE: " + this.mValue + ", REQUIRED: " + String.valueOf(this.mRequired);
    }

    public String getAlertTitle() {
        return (this.alertTitle == null) ? "" : this.alertTitle;
    }

    public FormElement setAlertTitle(String alertTitle) {
        this.alertTitle = alertTitle;
        return this;
    }

    public String getPositiveButtonText() {
        return (this.positiveButtonText == null) ? "OKAY" : this.positiveButtonText;
    }

    public FormElement setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public String getNegativeButtonText() {
        return (this.negativeButtonText == null) ? "CANCEL" : this.negativeButtonText;
    }

    public FormElement setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

}
