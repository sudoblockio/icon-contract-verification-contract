/*
 * Copyright 2022 Geometry Labs Inc.
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

package io.geometry.verification;

import score.Context;
import score.annotation.External;
import score.annotation.EventLog;

public class ContractVerification {
    private final String version;

    public ContractVerification() { this.version = version }

    @External(readonly = true)
    public String name() {
        return "ICON Contract Verification Contract";
    }

    @External
    public void verify(
            Address contract_address,
            String website,
            String team_name,
            String short_description,
            String long_description,
            String p_rep_address,
            String city,
            String country,
            String license,
            String facebook,
            String telegram,
            String reddit,
            String discord,
            String steemit,
            String twitter,
            String youtube,
            String github,
            String keybase,
            String wechat,
            String zipped_source_code,
            ) {
        this.contract_address = contract_address;
        this.email = email;
        this.website = website;
        this.team_name = team_name;
        this.short_description = short_description;
        this.short_description = short_description;
        this.p_rep_address = p_rep_address;
        this.city = city;
        this.country = country;
        this.license = license;
        this.facebook = facebook;
        this.telegram = telegram;
        this.reddit = reddit;
        this.discord = discord;
        this.steemit = steemit;
        this.twitter = twitter;
        this.youtube = youtube;
        this.github = github;
        this.keybase = keybase;
        this.wechat = wechat;
        this.zipped_source_code = zipped_source_code;
    ){
            Address _from = Context.getCaller();

            // Get owner of address being submitted
            // owner = ...

            // Verify that the owner equals the caller
            // Context.require(Context.getCaller().equals(Context.getOwner())); // wrong
            if (_from != owner) {
                throw new IllegalArgumentException();
            }

            // emit Verification event with all the input data acting simply as a pass through
            Verification(
                    address,
                    website,
                    team_name,
                    short_description,
                    long_description,
                    p_rep_address,
                    city,
                    country,
                    license,
                    facebook,
                    telegram,
                    reddit,
                    discord,
                    steemit,
                    twitter,
                    youtube,
                    github,
                    keybase,
                    wechat,
                    zipped_source_code,
                    );
        }
    }

    // This need cannot be a fully indexed event log unless it is split up (max 3 indexed events)
    // https://www.javadoc.io/doc/foundation.icon/javaee-api/latest/score/annotation/EventLog.html
    // Instead we either need to
    //  1. Keep a version number of the contract so we know what order the params we are parsing are in - should be the same as a proto order
    //  2. Emit separate event logs as indexed events - Can be groups of 3 max -
    //  3. Turned into json and emitted as bytes

    @EventLog()
    public void Verification(
            String version,
            Address address,
            String website,
            String team_name,
            String short_description,
            String long_description,
            String p_rep_address,
            String city,
            String country,
            String license,
            String facebook,
            String telegram,
            String reddit,
            String discord,
            String steemit,
            String twitter,
            String youtube,
            String github,
            String keybase,
            String wechat,
            String zipped_source_code,
            ) {
    }
}
