package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {
    /*
    System Users Text, Username Field, User Roll dropDown,
Employee Name Field,
 Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's
actions
     */
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systmUser;

    public void verifySystemUserText() {
        String exptetxt = "System Users";
        String actualTxt = systmUser.getText();
        Assert.assertEquals(actualTxt, exptetxt, "System User Text not verified");
        Reporter.log("System User Text not verified" + systmUser);
        CustomListeners.test.log(Status.PASS, "System User Text not verified" + systmUser);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement verifAddUsr;

    public void verifyAddUserText() {
        String exptetxt = "Add User";
        String actualTxt = verifAddUsr.getText();
        Assert.assertEquals(actualTxt, exptetxt, "Add User Text not verified");
        Reporter.log("Add User Text not verified" + verifAddUsr);
        CustomListeners.test.log(Status.PASS, "Add User Text not verified" + verifAddUsr);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement entSysUserName;

    public void enterSystemUserName() {
        sendTextToElement(entSysUserName, "");
        CustomListeners.test.log(Status.PASS, "enter systme user name" + entSysUserName);
        Reporter.log("enter system user name" + entSysUserName.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selctusrRole;

    public void selectSystemUserRole() {
        clickOnElement(selctusrRole);
        CustomListeners.test.log(Status.PASS, "select systmer user" + selctusrRole);
        Reporter.log("select system user" + selctusrRole.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement selctStatus;

    public void selectSystemStatus() {
        clickOnElement(selctStatus);
        CustomListeners.test.log(Status.PASS, "select systmer Status" + selctStatus);
        Reporter.log("select system Status" + selctStatus.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchBtn;

    public void searchButtonClick() {
        mouseHoverToElementAndClick(searchBtn);
        CustomListeners.test.log(Status.PASS, "Click on search button" + searchBtn);
        Reporter.log("Click on search button" + searchBtn.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement verifResultList;

    public void verifyUserResultList() {
        String exp = "";
        String act = verifResultList.getText();
        Assert.assertEquals(act, exp, "user not verified");
        CustomListeners.test.log(Status.PASS, "Click on search button" + searchBtn);
        Reporter.log("Click on search button" + searchBtn.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBoxTick;

    public void chechOnChechbox() {
        clickOnElement(checkBoxTick);
        CustomListeners.test.log(Status.PASS, "Click on checkbox button" + checkBoxTick);
        Reporter.log("Click on checkbox button" + checkBoxTick.toString());
    }
    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deletebtn;

    public void clickOnDeleteButton() {
        clickOnElement(deletebtn);
        CustomListeners.test.log(Status.PASS, "Click on delete button" + deletebtn);
        Reporter.log("Click on delete button" + deletebtn.toString());
    }
//@CacheLookup
//    @FindBy(xpath ="//button[normalize-space()='Yes, Delete']")

    public void okOnPopup() {
        acceptAlert();

    }
    @CacheLookup
    @FindBy(linkText = "Successfully Deleted")
    WebElement verifdeletuser;

    public void verifyUserSuccessfullyDelete() {
        String exp = "Successfully Deleted";
        String act = verifdeletuser.getText();
        Assert.assertEquals(act, exp, "not verify");
        CustomListeners.test.log(Status.PASS, "not verified delete user" + verifdeletuser);
        Reporter.log("not verified delete user" + verifdeletuser.toString());
    }

    @CacheLookup
    @FindBy(xpath="//body/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/button[2]")
    WebElement clickon;

    public void clickOnDeletePopUp() {
        clickOnElement(clickon);
        CustomListeners.test.log(Status.PASS, "click on delete popup" +clickon);
        Reporter.log("click on delete pop up" + clickon.toString());
    }

}