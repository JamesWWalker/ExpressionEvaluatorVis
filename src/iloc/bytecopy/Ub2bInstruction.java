/**
 * 
 */
package iloc.bytecopy;

import iloc.IlocInstruction;
import util.CException;
import visitor.IlocVisitor;

/**
 * @author carr
 *
 */
public class Ub2bInstruction extends IlocInstruction {

	/**
	 * 
	 */
	public Ub2bInstruction() {
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object accept(IlocVisitor visitor) throws CException {
		return visitor.visit(this);
	}

}
