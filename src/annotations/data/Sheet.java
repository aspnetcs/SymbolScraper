/******************************************************************************
* Sheet.java
*
* Copyright (c) 2018, 2019
* Ritvik Joshi, Parag Mali, Puneeth Kukkadapu, Mahshad Mahdavi, and 
* Richard Zanibbi
*
* Document and Pattern Recognition Laboratory
* Rochester Institute of Technology, USA
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

package annotations.data;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Sheet {
	
	// This class stores annotations per page or sheet
	
	Long pageId;
	String fileName;
	
	@Setter(AccessLevel.PUBLIC)
	BoundingBox boundingBox;
	
	@Setter(AccessLevel.PUBLIC)
	List<Text> textAreas;
	
	@Setter(AccessLevel.PUBLIC)
	List<Image> imageAreas;
	
	@Setter(AccessLevel.PUBLIC)
	List<MathData> mathAreas;
}
