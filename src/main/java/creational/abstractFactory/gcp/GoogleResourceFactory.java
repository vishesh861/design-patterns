package creational.abstractFactory.gcp;

import creational.abstractFactory.Instance;
import creational.abstractFactory.Instance.Capacity;
import creational.abstractFactory.ResourceFactory;
import creational.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
