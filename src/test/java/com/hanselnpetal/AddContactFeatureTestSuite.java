package com.hanselnpetal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.hanselnpetal.data.repos.CustomerContactRepositoryDbUnitTest;
import com.hanselnpetal.data.repos.CustomerContactRepositoryIntegrationTest;
import com.hanselnpetal.service.ContactsManagementServiceIntegrationTest;

@RunWith(Suite.class)
@SuiteClasses({ CustomerContactRepositoryDbUnitTest.class, CustomerContactRepositoryIntegrationTest.class,
		ContactsManagementServiceIntegrationTest.class, ApplicationTest.class })
public class AddContactFeatureTestSuite {

}
