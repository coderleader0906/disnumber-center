/*
 * Copyright 2023-2024 the leader
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.org.byc.disnumber.center.model.entity;

import cn.org.byc.disnumber.center.model.enums.RuleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rule implements Comparable<Rule>{

    private Integer id;
    private RuleType type;
    private Integer no;
    private String code;
    private String val;
    private String format;
    private Integer len;
    private Integer min;
    private Integer max;
    private Integer step;
    private String padding;
    private Integer instanceId;

    @Override
    public int compareTo(Rule o) {
        return this.getNo() - o.getNo();
    }
}
