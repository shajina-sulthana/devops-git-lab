# Experiment 4 – Ansible YAML Playbook

## Aim

To write and execute a simple YAML playbook using Ansible to automate basic system configuration tasks and observe idempotent behavior.

## Requirements

- Ubuntu / WSL2
- Python 3
- Ansible
- Text Editor / Terminal

## Files

- `hosts.ini` – Ansible inventory file containing the local host.
- `setup.yml` – YAML playbook containing variables and automation tasks.

## Inventory Configuration

The `hosts.ini` file defines localhost as a managed host using a local Ansible connection.

## Playbook Tasks

The `setup.yml` playbook performs the following tasks:

1. Creates the `/tmp/devops_lab` directory.
2. Creates `message.txt` inside the directory.
3. Displays the message `Ansible automation completed`.

## Execution

Run the playbook using:

```bash
ansible-playbook -i hosts.ini setup.yml
```

## Verification

The generated message file can be verified using:

```bash
cat /tmp/devops_lab/message.txt
```

Expected output:

```text
Ansible automation completed
```

## Idempotency

When the playbook is executed for the first time, the required files and directory are created.

When the same playbook is executed again, no changes are required and Ansible reports:

```text
changed=0
```

## Result

The Ansible YAML playbook was created and executed successfully. The required directory and message file were automated, and idempotent behavior was verified.
