/*
 * Copyright (c) 2012, 2013, Credit Suisse (Anatole Tresch), Werner Keil.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.javamoney.extras;

import java.util.Collection;

import javax.money.MonetaryAmount;
import javax.money.MonetaryFunction;

public class MonetaryCalculator {

	public String addFilter(MonetaryFunction<MonetaryAmount, Boolean> filter) {
		return filter.getClass().getSimpleName();
	}

	public String addFilter(String filterId,
			MonetaryFunction<MonetaryAmount, Boolean> filter) {
		return filterId;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getFilter(
			String filterId) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T removeFilter(
			String filterId) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getFilter(
			Class<T> visitorType) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getFilter(
			String visitorId, Class<T> visitorType) {
		return null;
	}

	public String addAmountVisitor(
			MonetaryFunction<MonetaryAmount, Boolean> visitor) {
		return visitor.getClass().getSimpleName();
	}

	public String addAmountVisitor(String visitorId,
			MonetaryFunction<MonetaryAmount, Boolean> visitor) {
		return visitorId;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getVisitor(
			String visitorId) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getVisitor(
			Class<T> visitorType) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T getVisitor(
			String visitorId, Class<T> visitorType) {
		return null;
	}

	public <T extends MonetaryFunction<MonetaryAmount, Boolean>> T removeVisitor(
			String visitorId) {
		return null;
	}

	public Collection<String> getVisitorIds() {
		return null;
	}

	public Collection<String> getFilterIds() {
		return null;
	}

	public Collection<MonetaryAmount> getFiltered(String filterId) {
		return null;
	}

	public int getVisited(String visitorId) {
		return 0;
	}

	public void init(MonetaryAmount... amounts) {

	}

	public void init(Collection<MonetaryAmount> amounts) {

	}

	public void reset() {

	}

	public void calculate() {

	}

}
