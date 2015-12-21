/**
 * 
 */
package rs.in.staleksit.demo.jersey2.service;

import java.util.List;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.in.staleksit.demo.jersey2.dto.ManufacturerDTO;
import rs.in.staleksit.demo.jersey2.model.manufacturer.ManufacturerImpl;
import rs.in.staleksit.demo.jersey2.repository.ManufacturerRepository;

/**
 *
 */
@Service("manufacturerService")
public class ManufacturerServiceImpl extends AbstractServiceImpl implements ManufacturerService {
	
	private ManufacturerRepository manufacturerRepository;
	
	@Autowired
	public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository, JTransfo jTransfo) {
		this.manufacturerRepository = manufacturerRepository;
		setJTransfo(jTransfo);
	}
	
	@Override
	public ManufacturerDTO findOne(Integer id) {
		ManufacturerImpl repositoryResult = manufacturerRepository.findOne(id);
		return getJTransfo().convert(repositoryResult, new ManufacturerDTO());
	}

	@Override
	public List<ManufacturerDTO> findAll() {
		List<ManufacturerImpl> repositoryResult = manufacturerRepository.findAll();
		return getJTransfo().convertList(repositoryResult, ManufacturerDTO.class);
	}

}
