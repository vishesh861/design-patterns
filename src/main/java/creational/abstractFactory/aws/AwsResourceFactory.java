package creational.abstractFactory.aws;

import creational.abstractFactory.Instance;
import creational.abstractFactory.Instance.Capacity;
import creational.abstractFactory.ResourceFactory;
import creational.abstractFactory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
