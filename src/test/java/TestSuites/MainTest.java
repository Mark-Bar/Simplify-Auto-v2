/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuites;

import KeywordDrivenTestFramework.Core.BaseClass;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

import static KeywordDrivenTestFramework.Entities.Enums.BrowserType.Headless;

/**
 *
 * @author Abongile Bonga Maso
 */

public class MainTest extends BaseClass{

    private static TestMarshall instance;

    public MainTest() {
        currentEnvironment = Enums.Environment.Careers24;
    }

    @Test
    public void RunSpree() throws Exception {
        System.out.println("Careers24 Test Cases");
        instance = new TestMarshall("src\\test\\resources\\TestPack.xlsx", Enums.BrowserType.Chrome);
        instance.runKeywordDrivenTests();
    }
}