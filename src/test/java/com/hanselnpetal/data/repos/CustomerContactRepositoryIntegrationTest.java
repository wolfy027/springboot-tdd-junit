package com.hanselnpetal.data.repos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.hanselnpetal.domain.CustomerContact;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CustomerContactRepositoryIntegrationTest {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CustomerContactRepository customerContactRepository;

	@Test
	public void testFindByEmail() {
		CustomerContact contact = new CustomerContact();
		contact.setFirstName("Jomon");
		contact.setLastName("Johny");
		contact.setEmail("jomon027@gmail.com");
		
		entityManager.persist(contact);
		
		CustomerContact searchedContact= customerContactRepository.findByEmail("jomon027@gmail.com");
		
		assertThat(searchedContact.getEmail(),is(equalTo("jomon027@gmail.com")));
		
	}

}
