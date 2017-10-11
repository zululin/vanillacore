/*******************************************************************************
 * Copyright 2017 vanilladb.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.vanilladb.core.sql;

import org.vanilladb.core.util.ByteHelper;

public class BigIntType extends Type {
	BigIntType() {
	}

	@Override
	public int getSqlType() {
		return java.sql.Types.BIGINT;
	}

	@Override
	public int getArgument() {
		return -1;
	}

	@Override
	public boolean isFixedSize() {
		return true;
	}

	@Override
	public boolean isNumeric() {
		return true;
	}

	@Override
	public int maxSize() {
		return ByteHelper.LONG_SIZE;
	}

	@Override
	public Constant maxValue() {
		return new BigIntConstant(Long.MAX_VALUE);
	}

	@Override
	public Constant minValue() {
		return new BigIntConstant(Long.MIN_VALUE);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || !(obj instanceof BigIntType))
			return false;
		BigIntType t = (BigIntType) obj;
		return getSqlType() == t.getSqlType()
				&& getArgument() == t.getArgument();
	}

	@Override
	public String toString() {
		return "BIGINT";
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

}
