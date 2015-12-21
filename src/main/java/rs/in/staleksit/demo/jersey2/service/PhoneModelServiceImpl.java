/**
 * 
 */
package rs.in.staleksit.demo.jersey2.service;

import java.util.List;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.in.staleksit.demo.jersey2.dto.PhoneModelDTO;
import rs.in.staleksit.demo.jersey2.model.phone.PhoneModelImpl;
import rs.in.staleksit.demo.jersey2.repository.PhoneModelRepository;

/**
 *
 */
@Service("phoneModelService")
public class PhoneModelServiceImpl extends AbstractServiceImpl implements PhoneModelService {

	private PhoneModelRepository phoneModelRepository;

	@Autowired
	public PhoneModelServiceImpl(PhoneModelRepository phoneModelRepository, JTransfo jTransfo) {
		this.phoneModelRepository = phoneModelRepository;
		setJTransfo(jTransfo);
	}
	
	@Override
	public PhoneModelDTO findOne(Integer id) {
		PhoneModelImpl repositoryResult = phoneModelRepository.findOne(id);
		return getJTransfo().convert(repositoryResult, new PhoneModelDTO());
	}

	@Override
	public List<PhoneModelDTO> findAll() {
		List<PhoneModelImpl> respositoryResult = phoneModelRepository.findAll();
		return getJTransfo().convertList(respositoryResult, PhoneModelDTO.class);
	}

}
